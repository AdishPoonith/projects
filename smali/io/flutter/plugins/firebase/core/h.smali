.class public final synthetic Lio/flutter/plugins/firebase/core/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Ljava/lang/Boolean;

.field public final synthetic l:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Boolean;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/core/h;->j:Ljava/lang/String;

    iput-object p2, p0, Lio/flutter/plugins/firebase/core/h;->k:Ljava/lang/Boolean;

    iput-object p3, p0, Lio/flutter/plugins/firebase/core/h;->l:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/firebase/core/h;->j:Ljava/lang/String;

    iget-object v1, p0, Lio/flutter/plugins/firebase/core/h;->k:Ljava/lang/Boolean;

    iget-object v2, p0, Lio/flutter/plugins/firebase/core/h;->l:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v0, v1, v2}, Lio/flutter/plugins/firebase/core/i;->o(Ljava/lang/String;Ljava/lang/Boolean;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
