package org.omg.PortableServer.CurrentPackage;


/**
* org/omg/PortableServer/CurrentPackage/NoContext.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON3/workspace/8-2-build-linux-amd64/jdk8u121/8372/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Monday, December 12, 2016 4:37:47 PM PST
*/

public final class NoContext extends org.omg.CORBA.UserException
{

  public NoContext ()
  {
    super(NoContextHelper.id());
  } // ctor


  public NoContext (String $reason)
  {
    super(NoContextHelper.id() + "  " + $reason);
  } // ctor

} // class NoContext