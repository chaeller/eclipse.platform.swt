package org.eclipse.swt.events;

/*
 * (c) Copyright IBM Corp. 2000, 2001.
 * All Rights Reserved
 */

/**
 * This adapter class provides default implementations for the
 * methods described by the <code>ControlListener</code> interface.
 * <p>
 * Classes that wish to deal with <code>ControlEvent</code>s can
 * extend this class and override only the methods which they are
 * interested in.
 * </p>
 *
 * @see ControlListener
 * @see ControlEvent
 */
public abstract class ControlAdapter implements ControlListener {

/**
 * Sent when the location (x, y) of a control changes relative
 * to its parent (or relative to the display, for <code>Shell</code>s).
 * The default behavior is to do nothing.
 *
 * @param e an event containing information about the move
 */
public void controlMoved(ControlEvent e) {
}

/**
 * Sent when the size (width, height) of a control changes.
 * The default behavior is to do nothing.
 *
 * @param e an event containing information about the resize
 */
public void controlResized(ControlEvent e) {
}
}
