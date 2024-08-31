package Hash;

public class Main 
{
    public static void main(String[] args)
    {
        CustomHash customHash = new CustomHash();

        customHash.put("java", 1);
        customHash.put("python", 2);
        customHash.put("cpp", 3);

        System.out.println("Value for 'java': " + customHash.get("java"));
        System.out.println("Value for 'python': " + customHash.get("python"));
        System.out.println("Value for 'cpp': " + customHash.get("cpp"));
        System.out.println("Value for 'linux': " + customHash.get("linux"));
    }
}