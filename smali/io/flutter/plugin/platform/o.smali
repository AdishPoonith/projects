.class public final synthetic Lio/flutter/plugin/platform/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:Lio/flutter/plugin/platform/q$a;

.field public final synthetic b:Lq8/k$d;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/platform/q$a;Lq8/k$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugin/platform/o;->a:Lio/flutter/plugin/platform/q$a;

    iput-object p2, p0, Lio/flutter/plugin/platform/o;->b:Lq8/k$d;

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugin/platform/o;->a:Lio/flutter/plugin/platform/q$a;

    iget-object v1, p0, Lio/flutter/plugin/platform/o;->b:Lq8/k$d;

    invoke-static {v0, v1, p1, p2}, Lio/flutter/plugin/platform/q$a;->k(Lio/flutter/plugin/platform/q$a;Lq8/k$d;Landroid/view/View;Z)V

    return-void
.end method
