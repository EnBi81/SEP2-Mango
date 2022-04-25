package util;

import java.beans.PropertyChangeListener;

public interface PropertyChangeSubject
{
  void addListener(String event, PropertyChangeListener listener);
  void addListener(PropertyChangeListener listener);
}
