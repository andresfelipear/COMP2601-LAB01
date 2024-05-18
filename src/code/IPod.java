import java.util.Objects;

/**
 * IPod
 *
 * @author Andres Arevalo & Nick
 * @version 1.0
 */
public class IPod extends IDevice
{
    private final double maxVolumeDecibels;

    private int songsStored;

    /**
     * Constructs an IPod with a specified purpose, maximum volume in decibels, and number of songs stored.
     *
     * @param purpose The purpose of this iPod.
     * @param maxVolumeDecibels The maximum volume in decibels for this iPod.
     * @param songsStored The number of songs stored on this iPod.
     */
    public IPod(final String purpose,
                final double maxVolumeDecibels,
                final int songsStored)
    {
        super(purpose);
        this.maxVolumeDecibels = maxVolumeDecibels;
        this.songsStored = songsStored;
    }

    /**
     * Prints the details of this iPod.
     */
    @Override
    public void printDetail()
    {
        System.out.println(this);
    }

    /**
     * Returns a string representation of this iPod.
     *
     * @return A string representation of the iPod.
     */
    @Override
    public String toString()
    {
        return super.toString() +
                "\nmaxVolume(decibels): " + maxVolumeDecibels +
                "\nsongsStored: " + songsStored;
    }

    /**
     * Compares this iPod to the specified object. The result is true if and only if
     * the argument is not null and is an IPod object that has the same number of songs stored as this iPod.
     *
     * @param obj The object to compare this IPod against.
     * @return true if the given object represents an IPod equivalent to this iPod, false otherwise.
     */
    @Override
    public boolean equals(final Object obj)
    {
        final IPod that;

        if(this == obj)
        {
            return true;
        }

        if(obj == null)
        {
            return false;
        }

        if(!(obj instanceof IPod))
        {
            return false;
        }

        that = (IPod) obj;

        return this.songsStored == that.songsStored;
    }

    /**
     * Returns a hash code value for the iPod. This method is supported for the benefit
     * of hash tables such as those provided by HashMap.
     *
     * @return A hash code value for this iPod.
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(songsStored);
    }
}
