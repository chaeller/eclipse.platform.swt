/********************************************************************************
 * Copyright (c) 2021 Equo
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Mauro Garcia, Equo - initial implementation
 ********************************************************************************/
package org.eclipse.swt.browser;

import org.eclipse.swt.*;
import org.eclipse.swt.events.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;

public class FindDialog extends Dialog {

	private static boolean isOpen = false;
	private Chromium chromium;

	public FindDialog(Chromium chromium, Shell shell) {
		super(shell);
		this.chromium = chromium;
	}

	public void open() {
		Shell parent = getParent();
		Shell shell = new Shell(parent, SWT.DIALOG_TRIM | SWT.MIN | SWT.MAX);
		shell.setText("Text search");
		GridLayout layout = new GridLayout(2, false);
		layout.marginHeight = 10;
		layout.marginWidth = 10;
		shell.setLayout(layout);

		Text find = new Text(shell, SWT.SINGLE | SWT.BORDER);

		GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gridData.horizontalSpan = 2;
		find.setLayoutData(gridData);

		Group direction = new Group(shell, SWT.NULL);
		direction.setText("Direction");
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		shell.setLayout(gridLayout);

		gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		direction.setLayout(gridLayout);
		gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gridData.horizontalSpan = 2;
		direction.setLayoutData(gridData);

		Button forward = new Button(direction, SWT.CHECK);
		Button backward = new Button(direction, SWT.CHECK);
		forward.setText("Forward");
		forward.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent event) {
				Button btn = (Button) event.getSource();
				if (backward.getSelection()) {
					backward.setSelection(false);
				}
				btn.setSelection(true);
			}
		});

		forward.setSelection(true);

		backward.setText("Backward");
		backward.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent event) {
				Button btn = (Button) event.getSource();
				if (forward.getSelection()) {
					forward.setSelection(false);
				}
				btn.setSelection(true);
			}
		});

		Button caseSensitive = new Button(shell, SWT.CHECK);
		caseSensitive.setText("Case sensitive");
		caseSensitive.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent event) {
				Button btn = (Button) event.getSource();
				chromium.find(null, forward.getSelection(),
						btn.getSelection());
				chromium.find(find.getText(), forward.getSelection(),
						btn.getSelection());
			}
		});

		Composite bar = new Composite(shell, SWT.NONE);
		bar.setLayoutData(new GridData(SWT.END, SWT.END, false, true, 2, 1));
		bar.setLayout(new GridLayout(2, true));

		Button closeButton = new Button(bar, SWT.PUSH);
		closeButton.setText("Close");
		closeButton.addListener(SWT.Selection, event -> {
			shell.close();
		});
		GridData closeData = new GridData(SWT.CENTER, SWT.END, false, false);
		closeData.widthHint = 80;
		closeButton.setLayoutData(closeData);

		Button findButton = new Button(bar, SWT.PUSH);
		findButton.setText("Find");
		findButton.addListener(SWT.Selection, event -> {
			chromium.find(find.getText(), forward.getSelection(),
					caseSensitive.getSelection());
			find.forceFocus();
		});
		GridData findData = new GridData(SWT.CENTER, SWT.END, false, false);
		findData.minimumWidth = SWT.DEFAULT;
		findData.widthHint = 80;
		findButton.setLayoutData(findData);

		shell.addListener(SWT.Close, event -> {
			isOpen = false;
			chromium.find(null, forward.getSelection(),
					caseSensitive.getSelection());
		});

		ModifyListener inputListener = e -> {
			String search = ("".equals(find.getText())) ? null : find.getText();
			chromium.find(search, forward.getSelection(), caseSensitive.getSelection());
		};
		find.addModifyListener(inputListener);

		find.addKeyListener(new KeyListener() {

			@Override
			public void keyReleased(KeyEvent e) {}

			@Override
			public void keyPressed(KeyEvent e) {
				if ( e.keyCode == SWT.CR) {
					String search = ("".equals(find.getText())) ? null : find.getText();
					chromium.find(search, forward.getSelection(),
							caseSensitive.getSelection());
				}
			}
		});
		find.forceFocus();
		shell.pack();
		isOpen = true;
		shell.open();

		// Sometimes you need to resize the dialog box after it becomes visible
		shell.pack();
	}

	public static boolean isOpen() {
		return isOpen;
	}
}
