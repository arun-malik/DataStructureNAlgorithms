#ifndef __DatastructuresApp__
#define __DatastructuresApp__

#include "wx/app.h"

class DatastructuresApp : public wxApp {
	

public:
	DatastructuresApp();
	~DatastructuresApp();
	
protected:
	virtual bool OnInit();
	virtual int OnExit();
};
#endif // DatastructuresApp

