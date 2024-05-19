
/**
 * IDevice
 *
 * @author Andres Arevalo
 * @author Nick Farrell
 * @version 1.0
 */
public abstract class IDevice
{
    private final String purpose;

    /**
     * Constructs an IDevice with a specified purpose.
     *
     * @param purpose The purpose of this device.
     */
    public IDevice(final String purpose)
    {
        this.purpose = purpose;
    }

    /**
     * Returns the purpose of this device.
     *
     * @return The purpose of the device.
     */
    public String getPurpose()
    {
        return purpose;
    }

    /**
     * Prints the details of the instance variables.
     * This method must be implemented by subclasses.
     */
    public abstract void printDetail();

    /**
     * Returns a string representation of this device.
     *
     * @return A string representation of the device.
     */
    @Override
    public String toString()
    {
        return  "the purpose of this IDevice is " + purpose;
    }

    /**
     * Compares this device to the specified object.
     * The result is true if and only if the argument is not null and is an IDevice object
     * that has the same purpose as this device, ignoring case considerations.
     *
     * @param obj The object to compare this IDevice against.
     * @return true if the given object represents an IDevice equivalent to this device, false otherwise.
     */
    @Override
    public boolean equals(final Object obj)
    {
        final IDevice that;

        if(this == obj)
        {
            return true;
        }

        if(obj == null)
        {
            return false;
        }

        if(!(obj instanceof IDevice))
        {
            return false;
        }

        that = (IDevice) obj;

        return this.purpose.equalsIgnoreCase(that.purpose);
    }

    /**
     * Returns a hash code value for the device. This method is supported for the benefit
     * of hash tables such as those provided by HashMap.
     *
     * @return A hash code value for this device.
     */
    @Override
    public int hashCode()
    {
        return purpose.hashCode();
    }
}