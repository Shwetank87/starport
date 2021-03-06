package com.krux.starport.cli

import org.joda.time.DateTime

import com.krux.starport.util.PipelineState

case class CleanupUnmanagedOptions(
  excludePrefixes: Seq[String] = Seq(),
  pipelineState: PipelineState.State = PipelineState.FINISHED,
  cutoffDate: DateTime = DateTime.now.minusMonths(2).withTimeAtStartOfDay,
  force: Boolean = false,
  dryRun: Boolean = false
)
