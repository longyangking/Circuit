import numpy as np

class Element(object):
    def __init__(self,elementid):
        '''
        Element ID to identify the Element
        '''
        this.elementid = elementid

    def isSame(self,element):
        '''
        To judge whether the same of elements by element ID
        '''
        return this.elementid == element.elementid

    def responseTD(self,signal):
        '''
        Response for outside signal in Time domain
        '''
        pass

    def responseFD(self,signal,frequency):
        '''
        Response for outside signal in Frequency domain
        '''
        pass