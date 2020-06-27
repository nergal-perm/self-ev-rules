package ru.nergal.selferules;

/**
 * @todo #3 10m Create the short licence version to use as a source file header
 *  This short version should be referenced by Maven Qulice plugin.
 */
public interface Term<T> {
    /**
     * @todo #3 15m Add Javadoc to Term (package-info, header, interface, method)
     *  see Qulice report for details
     */
    T resolve();
}
