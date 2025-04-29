.class public final synthetic Lio/flutter/plugin/platform/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lio/flutter/plugin/platform/c$b;

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/platform/c$b;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugin/platform/d;->j:Lio/flutter/plugin/platform/c$b;

    iput p2, p0, Lio/flutter/plugin/platform/d;->k:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugin/platform/d;->j:Lio/flutter/plugin/platform/c$b;

    iget v1, p0, Lio/flutter/plugin/platform/d;->k:I

    invoke-static {v0, v1}, Lio/flutter/plugin/platform/c$b;->a(Lio/flutter/plugin/platform/c$b;I)V

    return-void
.end method
