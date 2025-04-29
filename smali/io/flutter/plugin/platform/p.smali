.class public final synthetic Lio/flutter/plugin/platform/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lio/flutter/plugin/platform/q$a;

.field public final synthetic k:Lio/flutter/plugin/platform/r;

.field public final synthetic l:F

.field public final synthetic m:Lq8/k$b;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/platform/q$a;Lio/flutter/plugin/platform/r;FLq8/k$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugin/platform/p;->j:Lio/flutter/plugin/platform/q$a;

    iput-object p2, p0, Lio/flutter/plugin/platform/p;->k:Lio/flutter/plugin/platform/r;

    iput p3, p0, Lio/flutter/plugin/platform/p;->l:F

    iput-object p4, p0, Lio/flutter/plugin/platform/p;->m:Lq8/k$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lio/flutter/plugin/platform/p;->j:Lio/flutter/plugin/platform/q$a;

    iget-object v1, p0, Lio/flutter/plugin/platform/p;->k:Lio/flutter/plugin/platform/r;

    iget v2, p0, Lio/flutter/plugin/platform/p;->l:F

    iget-object v3, p0, Lio/flutter/plugin/platform/p;->m:Lq8/k$b;

    invoke-static {v0, v1, v2, v3}, Lio/flutter/plugin/platform/q$a;->l(Lio/flutter/plugin/platform/q$a;Lio/flutter/plugin/platform/r;FLq8/k$b;)V

    return-void
.end method
