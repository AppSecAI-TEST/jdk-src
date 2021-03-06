package org.omg.CORBA;

/**
* org/omg/CORBA/PolicyErrorHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON3/workspace/8-2-build-linux-amd64/jdk8u121/8372/corba/src/share/classes/org/omg/PortableInterceptor/CORBAX.idl
* Monday, December 12, 2016 4:37:46 PM PST
*/


/**
   * Thrown to indicate problems with parameter values passed to the
   * <code>ORB.create_policy</code> operation.  
   */
public final class PolicyErrorHolder implements org.omg.CORBA.portable.Streamable
{
  public PolicyError value = null;

  public PolicyErrorHolder ()
  {
  }

  public PolicyErrorHolder (PolicyError initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = PolicyErrorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    PolicyErrorHelper.write (o, value);
  }

  public TypeCode _type ()
  {
    return PolicyErrorHelper.type ();
  }

}
