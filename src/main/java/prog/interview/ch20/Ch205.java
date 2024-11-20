package prog.interview.ch20;

public class Ch205 {

    public static class Account{
        public final int id;
        public int balance;

        public Account(int id, int balance) {
            this.id = id;
            this.balance = balance;
        }
    }

    public static class AccountManager{
        public static boolean move(Account from, Account to, int amount){
            final Account lock1 = from.id < to.id ? from : to;
            final Account lock2 = from.id < to.id ? to : from;

            synchronized (lock1){
                synchronized (lock2){
                    if (from.balance < amount){
                        return false;
                    }

                    from.balance -= amount;
                    to.balance += amount;

                    return true;
                }
            }
        }
    }
}
