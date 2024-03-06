package miniProject;

 enum course {
	 DBA(10),REACT(15),ANGULAR(15),REST(12),SPRING(10),HIBERNATE(10);
	 private int capacity;

	course(int capacity) {
		this.capacity=capacity;
	}
	public int getCapacity() {
		return capacity;
		
	}

}
