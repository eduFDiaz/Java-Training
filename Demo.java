class Demo{
    public static void main(String args[]){
        if(args.length!=0){
            System.out.println("Arguments were passed!");    
            for (String arg : args) {
                System.out.println(arg);    
            }
        } else { 
            System.out.println("No arguments were passed!");    
        }
    }
}