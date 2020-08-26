class FindEvenDigit {
    public static int findNumbers(int[] nums) {
            int count = 0;
    for (int num : nums) {
      count += String.valueOf(num).length() % 2 == 0 ? 1 : 0;
    }
    return count;
  }

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(findNumbers(nums));
    }
}