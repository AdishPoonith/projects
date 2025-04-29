.class public final synthetic Lq4/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/q;


# instance fields
.field public final synthetic a:Lt4/f;


# direct methods
.method public synthetic constructor <init>(Lt4/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq4/o;->a:Lt4/f;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lq4/o;->a:Lt4/f;

    check-cast p1, Lq4/a0;

    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "locationSettingsRequest can\'t be null"

    invoke-static {v1, v2}, Lc4/s;->b(ZLjava/lang/Object;)V

    invoke-virtual {p1}, Lc4/c;->C()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lq4/b1;

    new-instance v1, Lq4/t;

    invoke-direct {v1, p2}, Lq4/t;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    const/4 p2, 0x0

    invoke-interface {p1, v0, v1, p2}, Lq4/b1;->O0(Lt4/f;Lq4/d1;Ljava/lang/String;)V

    return-void
.end method
