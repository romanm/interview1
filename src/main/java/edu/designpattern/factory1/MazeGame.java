package edu.designpattern.factory1;

public class MazeGame {
    public MazeGame() {
        Room room1 = makeRoom();
        Room room2 = makeRoom();
        room1.connect(room2);
        this.addRoom(room1);
        this.addRoom(room2);
    }
 
    private void addRoom(Room room1) {
	}

	protected Room makeRoom() {
        return new OrdinaryRoom();
    }
}

