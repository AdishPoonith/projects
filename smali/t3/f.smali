.class public final synthetic Lt3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt3/h;


# instance fields
.field public final synthetic a:Landroid/accounts/Account;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt3/f;->a:Landroid/accounts/Account;

    iput-object p2, p0, Lt3/f;->b:Ljava/lang/String;

    iput-object p3, p0, Lt3/f;->c:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/IBinder;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lt3/f;->a:Landroid/accounts/Account;

    iget-object v1, p0, Lt3/f;->b:Ljava/lang/String;

    iget-object v2, p0, Lt3/f;->c:Landroid/os/Bundle;

    invoke-static {v0, v1, v2, p1}, Lt3/i;->e(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/IBinder;)Lcom/google/android/gms/auth/TokenData;

    move-result-object p1

    return-object p1
.end method
