import java.util.Objects;

/**
 * IPhoneFifteen of Iphone
 *
 * @author Andres Arevalo
 * @author Nick Farrell
 * @version 1.0
 */
public class IPhoneFifteen extends IPhone
{
    private final boolean hasHighResolutionCamera;
    private final int     memorySizeGb;

    /**
     * Constructs an IPhoneFifteen with a specified purpose, minutes remaining, carrier, high resolution camera capability, and memory size.
     *
     * @param purpose The purpose of this iPhone Fifteen.
     * @param minutesRemaining The number of minutes remaining on this iPhone Fifteen.
     * @param carrier The carrier of this iPhone Fifteen.
     * @param hasHighResolutionCamera Whether this iPhone Fifteen has a high resolution camera.
     * @param memorySizeGb The memory size in gigabytes of this iPhone Fifteen.
     */
    public IPhoneFifteen(final String  purpose,
                         final double  minutesRemaining,
                         final String  carrier,
                         final boolean hasHighResolutionCamera,
                         final int     memorySizeGb)
    {
        super(purpose,
              minutesRemaining,
              carrier);

        this.hasHighResolutionCamera = hasHighResolutionCamera;
        this.memorySizeGb = memorySizeGb;
    }

    /**
     * Returns a string representation of this iPhone Fifteen.
     *
     * @return A string representation of the iPhone Fifteen.
     */
    @Override
    public String toString()
    {
        return super.toString() +
                "\nMemory Size(GB): " + memorySizeGb+
                "\nHigh Resolution Camera: " + (hasHighResolutionCamera?"yes":"no");
    }

    /**
     * Compares this iPhone Fifteen to the specified object. The result is true if and only if
     * the argument is not null and is an IPhoneFifteen object that has the same high resolution camera capability
     * and memory size as this iPhone Fifteen.
     *
     * @param obj The object to compare this IPhoneFifteen against.
     * @return true if the given object represents an IPhoneFifteen equivalent to this iPhone Fifteen, false otherwise.
     */
    @Override
    public boolean equals(final Object obj)
    {
        if(this == obj)
        {
            return true;
        }

        if(obj == null)
        {
            return false;
        }

        if(!(obj instanceof IPhoneFifteen))
        {
            return true;
        }

        if(!super.equals(obj))
        {
            return false;
        }

        final IPhoneFifteen that;

        that = (IPhoneFifteen) obj;

        return (this.hasHighResolutionCamera == that.hasHighResolutionCamera &&
                super.getMinutesRemaining() == that.getMinutesRemaining());
    }

    /**
     * Returns a hash code value for the iPhone Fifteen. This method is supported for the benefit
     * of hash tables such as those provided by HashMap.
     *
     * @return A hash code value for this iPhone Fifteen.
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(),
                            hasHighResolutionCamera);
    }
}
