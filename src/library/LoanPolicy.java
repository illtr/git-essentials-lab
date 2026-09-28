package library;

public class LoanPolicy {
    public int maxBooks(MemberType type) { return type == MemberType.STUDENT ? 3 : 5; }
    public int loanDays() { return 14; }
<<<<<<< HEAD
    public int overdueFee(int daysLate) { return daysLate * 100; }
}
=======
    public int overdueFee(int daysLate) { return Math.max(0, daysLate) * 100; }
}
>>>>>>> 2c647b6 (fix: clamp negative overdue days)
