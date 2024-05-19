import java.util.Objects;

/**
 * Iphone
 *
 * @author Andres Arevalo
 * @author Nick Farrell
 * @version 1.0
 */
public class IPhone extends IDevice
{
    private double minutesRemaining;
    private String carrier;

    /**
     * Constructs an IPhone with a specified purpose, minutes remaining, and carrier.
     *
     * @param purpose The purpose of this iPhone.
     * @param minutesRemaining The number of minutes remaining on this iPhone.
     * @param carrier The carrier of this iPhone.
     */
    public IPhone(final String purpose,
                  final double minutesRemaining,
                  final String carrier)
    {
        super(purpose);
        this.minutesRemaining = minutesRemaining;
        this.carrier = carrier;
    }

    /**
     * Returns the number of minutes remaining on this iPhone.
     *
     * @return The number of minutes remaining.
     */
    public double getMinutesRemaining()
    {
        return minutesRemaining;
    }

    /**
     * Returns the carrier of this iPhone.
     *
     * @return The carrier of the iPhone.
     */
    public String getCarrier()
    {
        return carrier;
    }

    /**
     * Prints the details of this iPhone.
     */
    @Override
    public void printDetail()
    {
        System.out.println(this);
    }

    /**
     * Returns a string representation of this iPhone.
     *
     * @return A string representation of the iPhone.
     */
    @Override
    public String toString()
    {
        return super.toString() +
                "\nCarrier: " + carrier+
                "\nminutes Remaining: " + minutesRemaining;
    }

    /**
     * Compares this iPhone to the specified object. The result is true if and only if
     * the argument is not null and is an IPhone object that has the same minutes remaining as this iPhone.
     *
     * @param obj The object to compare this IPhone against.
     * @return true if the given object represents an IPhone equivalent to this iPhone, false otherwise.
     */
    @Override
    public boolean equals(final Object obj)
    {
        final IPhone that;

        if(this == obj)
        {
            return true;
        }

        if(obj == null)
        {
            return false;
        }

        if(!(obj instanceof IPhone))
        {
            return false;
        }

        that = (IPhone) obj;

        return this.minutesRemaining == that.minutesRemaining;
    }

    /**
     * Returns a hash code value for the iPhone. This method is supported for the benefit
     * of hash tables such as those provided by HashMap.
     *
     * @return A hash code value for this iPhone.
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(minutesRemaining);
    }
}
