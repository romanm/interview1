package edu.designpattern.decorator1;

class HorizontalScrollBarDecorator extends WindowDecorator {
	public HorizontalScrollBarDecorator (Window decoratedWindow) {
		super(decoratedWindow);
	}

	@Override
	public void draw() {
		super.draw();
		drawHorizontalScrollBar();
	}

	private void drawHorizontalScrollBar() {
		// Draw the horizontal scrollbar
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", including horizontal scrollbars";
	}
}