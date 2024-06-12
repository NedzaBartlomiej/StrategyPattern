class StartegyContextClass {
    private Strategy strategy;
    
    public StartegyContextClass() {
        
    }
    
    public void doSomething() {
        strategy.doSomething();
    }
    
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}