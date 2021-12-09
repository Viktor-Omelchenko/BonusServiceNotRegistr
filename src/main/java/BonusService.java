public class BonusService {

    public long calculate(long amount, boolean registered) {
        int percent = registered ? 3 : 1;
        long bonus = amount * percent / 100 / 100;
        long limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }


    public long calculateNotRegistered(long amount, boolean notRegistered) {
        int percent = notRegistered ? 3 : 1;
        long bonus = amount * percent / 100 / 100;
        long limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}

