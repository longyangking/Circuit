import numpy as np

# Test-Driven Programming

import model.*

model = ModelUtil.create('Model')

model.modelPath('')

model.comments(['RLC'])

model.modelNode.create('comp1')

model.physics.create('cir','Circuit')

model.study.create('std1')
model.study('std1').create('time','Transient')
model.study('std1').feature('time').activate('cir',true)

model.physics('cir').feature.create('R1','Resistor',-1)
model.physics('cir').feature.create('V1','VoltageSource',-1)
model.physics('cir').feature('V1').set('sourceType','SineSource')

model.study('std1').feature('time').set('tlist','range(0,0.001,0.1)')

model.sol.create('sol1')
model.sol('sol1').study('std1')

model.study('std1').feature('time').set('notlistsolnum', 1)
model.study('std1').feature('time').set('notsolnum', '1')
model.study('std1').feature('time').set('listsolnum', 1)
model.study('std1').feature('time').set('solnum', '1')

model.sol('sol1').create('st1', 'StudyStep')
model.sol('sol1').feature('st1').set('study', 'std1')
model.sol('sol1').feature('st1').set('studystep', 'time')
model.sol('sol1').create('v1', 'Variables')
model.sol('sol1').feature('v1').set('control', 'time')
model.sol('sol1').create('t1', 'Time')
model.sol('sol1').feature('t1').set('tlist', 'range(0,(5/1[kHz]-0)/99,5/1[kHz])')
model.sol('sol1').feature('t1').set('plot', 'off')
model.sol('sol1').feature('t1').set('plotgroup', 'Default')
model.sol('sol1').feature('t1').set('plotfreq', 'tout')
model.sol('sol1').feature('t1').set('probesel', 'all')
model.sol('sol1').feature('t1').set('probes', {})
model.sol('sol1').feature('t1').set('probefreq', 'tsteps')
model.sol('sol1').feature('t1').set('control', 'time')
model.sol('sol1').feature('t1').create('fc1', 'FullyCoupled')
model.sol('sol1').feature('t1').feature('fc1').set('linsolver', 'dDef')
model.sol('sol1').feature('t1').feature.remove('fcDef')
model.sol('sol1').attach('std1')
model.sol('sol1').runAll

model.result.create('pg1', 'PlotGroup1D')
model.result('pg1').run
model.result('pg1').create('glob1', 'Global')
model.result('pg1').feature('glob1').set('expr', {'comp1.cir.v_1'})
model.result('pg1').feature('glob1').set('descr', {'Voltage at node 1'})
model.result('pg1').feature('glob1').set('unit', {'V'})
model.result('pg1').run

model.save('')