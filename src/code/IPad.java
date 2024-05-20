import java.util.Objects;

/**
 * IPad
 *
 * @author Andres Arevalo
 * @author Nick Farrell
 * @version 1.0
 */
public class IPad extends IDevice
{
    private final String versionOS;

    private boolean hasCase;

    private static final String PURPOSE = "learning";

    /**
     * Constructs an IPad with a specified purpose, operating system version, and whether it has a case.
     *
     * @param versionOS The operating system version of this iPad.
     * @param hasCase Whether this iPad has a case.
     */
    public IPad(final String versionOS,
                final boolean hasCase)
    {
        super(PURPOSE);
        this.versionOS = versionOS;
        this.hasCase = hasCase;
    }

    /**
     * Prints the details of this iPad.
     */
    @Override
    public void printDetail()
    {
        System.out.println(this);
    }

    /**
     *
     * @return "yes" if the device has case otherwise "no".
     */
    public String hasCaseDetails()
    {
        if(hasCase)
        {
            return "yes";
        }
        else
        {
            return "no";
        }
    }

    /**
     * Returns a string representation of this iPad.
     *
     * @return A string representation of the iPad.
     */
    @Override
    public String toString()
    {
        return super.toString() +
                "\nOperating System Version: " + versionOS +
                "\nHas a case? " + hasCaseDetails();
    }

    /**
     * Compares this iPad to the specified object. The result is true if and only if
     * the argument is not null and is an IPad object that has the same operating system version as this iPad.
     *
     * @param obj The object to compare this IPad against.
     * @return true if the given object represents an IPad equivalent to this iPad, false otherwise.
     */
    @Override
    public boolean equals(final Object obj)
    {
        final IPad that;

        if(this == obj)
        {
            return true;
        }

        if(obj == null)
        {
            return false;
        }

        if(!(obj instanceof IPad))
        {
            return false;
        }

        that = (IPad) obj;

        return this.versionOS.equalsIgnoreCase(that.versionOS);
    }

    /**
     * Returns a hash code value for the iPad. This method is supported for the benefit
     * of hash tables such as those provided by HashMap.
     *
     * @return A hash code value for this iPad.
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(versionOS);
    }
}
