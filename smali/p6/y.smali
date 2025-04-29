.class public final synthetic Lp6/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/Continuation;


# instance fields
.field public final synthetic a:Lp6/f0;

.field public final synthetic b:Li9/z0;


# direct methods
.method public synthetic constructor <init>(Lp6/f0;Li9/z0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/y;->a:Lp6/f0;

    iput-object p2, p0, Lp6/y;->b:Li9/z0;

    return-void
.end method


# virtual methods
.method public final then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lp6/y;->a:Lp6/f0;

    iget-object v1, p0, Lp6/y;->b:Li9/z0;

    invoke-static {v0, v1, p1}, Lp6/f0;->c(Lp6/f0;Li9/z0;Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
