package org.omg.IOP;


/**
* org/omg/IOP/MultipleComponentProfileHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Friday, April 10, 2015 12:30:56 PM PDT
*/


/** An array of tagged components, forming a multiple component profile. */
public final class MultipleComponentProfileHolder implements org.omg.CORBA.portable.Streamable
{
  public TaggedComponent value[] = null;

  public MultipleComponentProfileHolder ()
  {
  }

  public MultipleComponentProfileHolder (TaggedComponent[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = MultipleComponentProfileHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    MultipleComponentProfileHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return MultipleComponentProfileHelper.type ();
  }

}