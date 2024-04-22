package ee.taltech.inbankbackend.config;

/**
 * Holds all necessary constants for the decision engine.
 */
public class DecisionEngineConstants {
    public static final Integer MINIMUM_LOAN_AMOUNT = 2000;
    public static final Integer MAXIMUM_LOAN_AMOUNT = 10000;
    public static final Integer MAXIMUM_LOAN_PERIOD = 60;
    public static final Integer MINIMUM_LOAN_PERIOD = 12;
    public static final Integer SEGMENT_1_CREDIT_MODIFIER = 100;
    public static final Integer SEGMENT_2_CREDIT_MODIFIER = 300;
    public static final Integer SEGMENT_3_CREDIT_MODIFIER = 1000;

    /**
     * The arithmetic average of the average life expectancy of the Baltic countries in 2024
     * Source: https://database.earth/population/estonia/life-expectancy,
     * https://database.earth/population/latvia/life-expectancy,
     * https://database.earth/population/lithuania/life-expectancy
     */

    public static final Integer CURRENT_LIFE_EXPECTANCY_MALE = (75 + 72 + 73) / 3;
    public static final Integer CURRENT_LIFE_EXPECTANCY_FEMALE = (83 + 80 + 81) / 3;

    public static final Integer AGE_OF_MAJORITY = 18;
}
