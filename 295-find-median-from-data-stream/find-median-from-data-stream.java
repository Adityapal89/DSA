class MedianFinder {
    PriorityQueue<Double> left;
    PriorityQueue<Double> right;
    public MedianFinder() {
        left = new PriorityQueue<>(Collections.reverseOrder());
        right = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(left.size() == 0) left.add((double)num);
        else{
            if(num<left.peek()) left.add((double)num);
            else right.add((double)num);
        }

        if(left.size() == right.size()+2){
            right.add(left.remove());
        }
        if(right.size() == left.size()+2){
            left.add(right.remove());
        }
    }
    
    public double findMedian() {
        if(left.size() == right.size()+1){
            return left.peek();
        } else if(right.size() == left.size()+1){
            return right.peek();
        } else{
            return (left.peek()+right.peek())/2.0;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */