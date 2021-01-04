public class Range {
    private int start;
    private int end;
    
    public Range(int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("start value must be less than end value");
        }
        
        this.start = start;
        this.end = end;
    }
    
    public Range(int length) {
        start = 0;
        end = length;
    }
    
    public int getStart() {
        return start;
    }
    
    private void setStart(int start) {
        if (start > end) {
            throw new IllegalArgumentException("start value must be less than end value");
        }
        
        this.start = start;
    }
    
    public int getEnd() {
        return end;
    }
    
    public int length() {
        return end - start;
    }
    
    private void setEnd(int end) {
        if (end < start) {
            throw new IllegalArgumentException("end value must be greater than start value");
        }
        
        this.end = end;
    }
}
