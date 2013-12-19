##
## Auto Generated makefile by CodeLite IDE
## any manual changes will be erased      
##
## Debug
ProjectName            :=DataStructures
ConfigurationName      :=Debug
WorkspacePath          := "/home/gauravkesarwani/.codelite/CPrograms_Workspace"
ProjectPath            := "/home/gauravkesarwani/.codelite/CPrograms_Workspace/DataStructures"
IntermediateDirectory  :=./Debug
OutDir                 := $(IntermediateDirectory)
CurrentFileName        :=
CurrentFilePath        :=
CurrentFileFullPath    :=
User                   :=Gaurav Kesarwani
Date                   :=12/19/13
CodeLitePath           :="/home/gauravkesarwani/.codelite"
LinkerName             :=g++
SharedObjectLinkerName :=g++ -shared -fPIC
ObjectSuffix           :=.o
DependSuffix           :=.o.d
PreprocessSuffix       :=.o.i
DebugSwitch            :=-gstab
IncludeSwitch          :=-I
LibrarySwitch          :=-l
OutputSwitch           :=-o 
LibraryPathSwitch      :=-L
PreprocessorSwitch     :=-D
SourceSwitch           :=-c 
OutputFile             :=$(IntermediateDirectory)/$(ProjectName)
Preprocessors          :=
ObjectSwitch           :=-o 
ArchiveOutputSwitch    := 
PreprocessOnlySwitch   :=-E 
ObjectsFileList        :="DataStructures.txt"
PCHCompileFlags        :=
MakeDirCommand         :=mkdir -p
LinkOptions            :=  
IncludePath            :=  $(IncludeSwitch). $(IncludeSwitch). 
IncludePCH             := 
RcIncludePath          := 
Libs                   := 
ArLibs                 :=  
LibPath                := $(LibraryPathSwitch). 

##
## Common variables
## AR, CXX, CC, AS, CXXFLAGS and CFLAGS can be overriden using an environment variables
##
AR       := ar rcus
CXX      := g++
CC       := gcc
CXXFLAGS :=  -g -O0 -Wall $(Preprocessors)
CFLAGS   :=  -g -O0 -Wall $(Preprocessors)
ASFLAGS  := 
AS       := as


##
## User defined environment variables
##
CodeLiteDir:=/usr/share/codelite
Objects0=$(IntermediateDirectory)/BubbleSort$(ObjectSuffix) $(IntermediateDirectory)/insertionsort$(ObjectSuffix) $(IntermediateDirectory)/SelectionSort$(ObjectSuffix) $(IntermediateDirectory)/Tester$(ObjectSuffix) 



Objects=$(Objects0) 

##
## Main Build Targets 
##
.PHONY: all clean PreBuild PrePreBuild PostBuild
all: $(OutputFile)

$(OutputFile): $(IntermediateDirectory)/.d $(Objects) 
	@$(MakeDirCommand) $(@D)
	@echo "" > $(IntermediateDirectory)/.d
	@echo $(Objects0)  > $(ObjectsFileList)
	$(LinkerName) $(OutputSwitch)$(OutputFile) @$(ObjectsFileList) $(LibPath) $(Libs) $(LinkOptions)

$(IntermediateDirectory)/.d:
	@test -d ./Debug || $(MakeDirCommand) ./Debug

PreBuild:


##
## Objects
##
$(IntermediateDirectory)/BubbleSort$(ObjectSuffix): BubbleSort.cpp $(IntermediateDirectory)/BubbleSort$(DependSuffix)
	$(CXX) $(IncludePCH) $(SourceSwitch) "/home/gauravkesarwani/.codelite/CPrograms_Workspace/DataStructures/BubbleSort.cpp" $(CXXFLAGS) $(ObjectSwitch)$(IntermediateDirectory)/BubbleSort$(ObjectSuffix) $(IncludePath)
$(IntermediateDirectory)/BubbleSort$(DependSuffix): BubbleSort.cpp
	@$(CXX) $(CXXFLAGS) $(IncludePCH) $(IncludePath) -MG -MP -MT$(IntermediateDirectory)/BubbleSort$(ObjectSuffix) -MF$(IntermediateDirectory)/BubbleSort$(DependSuffix) -MM "BubbleSort.cpp"

$(IntermediateDirectory)/BubbleSort$(PreprocessSuffix): BubbleSort.cpp
	@$(CXX) $(CXXFLAGS) $(IncludePCH) $(IncludePath) $(PreprocessOnlySwitch) $(OutputSwitch) $(IntermediateDirectory)/BubbleSort$(PreprocessSuffix) "BubbleSort.cpp"

$(IntermediateDirectory)/insertionsort$(ObjectSuffix): insertionsort.cpp $(IntermediateDirectory)/insertionsort$(DependSuffix)
	$(CXX) $(IncludePCH) $(SourceSwitch) "/home/gauravkesarwani/.codelite/CPrograms_Workspace/DataStructures/insertionsort.cpp" $(CXXFLAGS) $(ObjectSwitch)$(IntermediateDirectory)/insertionsort$(ObjectSuffix) $(IncludePath)
$(IntermediateDirectory)/insertionsort$(DependSuffix): insertionsort.cpp
	@$(CXX) $(CXXFLAGS) $(IncludePCH) $(IncludePath) -MG -MP -MT$(IntermediateDirectory)/insertionsort$(ObjectSuffix) -MF$(IntermediateDirectory)/insertionsort$(DependSuffix) -MM "insertionsort.cpp"

$(IntermediateDirectory)/insertionsort$(PreprocessSuffix): insertionsort.cpp
	@$(CXX) $(CXXFLAGS) $(IncludePCH) $(IncludePath) $(PreprocessOnlySwitch) $(OutputSwitch) $(IntermediateDirectory)/insertionsort$(PreprocessSuffix) "insertionsort.cpp"

$(IntermediateDirectory)/SelectionSort$(ObjectSuffix): SelectionSort.cpp $(IntermediateDirectory)/SelectionSort$(DependSuffix)
	$(CXX) $(IncludePCH) $(SourceSwitch) "/home/gauravkesarwani/.codelite/CPrograms_Workspace/DataStructures/SelectionSort.cpp" $(CXXFLAGS) $(ObjectSwitch)$(IntermediateDirectory)/SelectionSort$(ObjectSuffix) $(IncludePath)
$(IntermediateDirectory)/SelectionSort$(DependSuffix): SelectionSort.cpp
	@$(CXX) $(CXXFLAGS) $(IncludePCH) $(IncludePath) -MG -MP -MT$(IntermediateDirectory)/SelectionSort$(ObjectSuffix) -MF$(IntermediateDirectory)/SelectionSort$(DependSuffix) -MM "SelectionSort.cpp"

$(IntermediateDirectory)/SelectionSort$(PreprocessSuffix): SelectionSort.cpp
	@$(CXX) $(CXXFLAGS) $(IncludePCH) $(IncludePath) $(PreprocessOnlySwitch) $(OutputSwitch) $(IntermediateDirectory)/SelectionSort$(PreprocessSuffix) "SelectionSort.cpp"

$(IntermediateDirectory)/Tester$(ObjectSuffix): Tester.cpp $(IntermediateDirectory)/Tester$(DependSuffix)
	$(CXX) $(IncludePCH) $(SourceSwitch) "/home/gauravkesarwani/.codelite/CPrograms_Workspace/DataStructures/Tester.cpp" $(CXXFLAGS) $(ObjectSwitch)$(IntermediateDirectory)/Tester$(ObjectSuffix) $(IncludePath)
$(IntermediateDirectory)/Tester$(DependSuffix): Tester.cpp
	@$(CXX) $(CXXFLAGS) $(IncludePCH) $(IncludePath) -MG -MP -MT$(IntermediateDirectory)/Tester$(ObjectSuffix) -MF$(IntermediateDirectory)/Tester$(DependSuffix) -MM "Tester.cpp"

$(IntermediateDirectory)/Tester$(PreprocessSuffix): Tester.cpp
	@$(CXX) $(CXXFLAGS) $(IncludePCH) $(IncludePath) $(PreprocessOnlySwitch) $(OutputSwitch) $(IntermediateDirectory)/Tester$(PreprocessSuffix) "Tester.cpp"


-include $(IntermediateDirectory)/*$(DependSuffix)
##
## Clean
##
clean:
	$(RM) $(IntermediateDirectory)/BubbleSort$(ObjectSuffix)
	$(RM) $(IntermediateDirectory)/BubbleSort$(DependSuffix)
	$(RM) $(IntermediateDirectory)/BubbleSort$(PreprocessSuffix)
	$(RM) $(IntermediateDirectory)/insertionsort$(ObjectSuffix)
	$(RM) $(IntermediateDirectory)/insertionsort$(DependSuffix)
	$(RM) $(IntermediateDirectory)/insertionsort$(PreprocessSuffix)
	$(RM) $(IntermediateDirectory)/SelectionSort$(ObjectSuffix)
	$(RM) $(IntermediateDirectory)/SelectionSort$(DependSuffix)
	$(RM) $(IntermediateDirectory)/SelectionSort$(PreprocessSuffix)
	$(RM) $(IntermediateDirectory)/Tester$(ObjectSuffix)
	$(RM) $(IntermediateDirectory)/Tester$(DependSuffix)
	$(RM) $(IntermediateDirectory)/Tester$(PreprocessSuffix)
	$(RM) $(OutputFile)
	$(RM) "../.build-debug/DataStructures"


