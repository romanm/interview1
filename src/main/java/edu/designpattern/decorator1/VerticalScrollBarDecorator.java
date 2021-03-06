package edu.designpattern.decorator1;

class VerticalScrollBarDecorator extends WindowDecorator {
	public VerticalScrollBarDecorator (Window decoratedWindow) {
		super(decoratedWindow);
	}

	@Override
	public void draw() {
		super.draw();
		drawVerticalScrollBar();
	}

	private void drawVerticalScrollBar() {
		// Draw the vertical scrollbar
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", including vertical scrollbars";
	}
}