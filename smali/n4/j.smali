.class public final synthetic Ln4/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/q;


# instance fields
.field public final synthetic a:Ln4/b;


# direct methods
.method public synthetic constructor <init>(Ln4/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln4/j;->a:Ln4/b;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ln4/j;->a:Ln4/b;

    check-cast p1, Ln4/i;

    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {p1}, Lc4/c;->C()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Ln4/f;

    new-instance v1, Ln4/k;

    invoke-direct {v1, v0, p2}, Ln4/k;-><init>(Ln4/b;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {p1, v1}, Ln4/f;->M(Ln4/h;)V

    return-void
.end method
