.class public final Lc4/e1;
.super Lc4/x0;
.source "SourceFile"


# instance fields
.field private a:Lc4/c;

.field private final b:I


# direct methods
.method public constructor <init>(Lc4/c;I)V
    .locals 0

    invoke-direct {p0}, Lc4/x0;-><init>()V

    iput-object p1, p0, Lc4/e1;->a:Lc4/c;

    iput p2, p0, Lc4/e1;->b:I

    return-void
.end method


# virtual methods
.method public final E2(ILandroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lc4/e1;->a:Lc4/c;

    const-string v1, "onPostInitComplete can be called only once per call to getRemoteService"

    invoke-static {v0, v1}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lc4/e1;->a:Lc4/c;

    iget v1, p0, Lc4/e1;->b:I

    invoke-virtual {v0, p1, p2, p3, v1}, Lc4/c;->M(ILandroid/os/IBinder;Landroid/os/Bundle;I)V

    const/4 p1, 0x0

    iput-object p1, p0, Lc4/e1;->a:Lc4/c;

    return-void
.end method

.method public final Z(ILandroid/os/IBinder;Lc4/i1;)V
    .locals 2

    iget-object v0, p0, Lc4/e1;->a:Lc4/c;

    const-string v1, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService"

    invoke-static {v0, v1}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0, p3}, Lc4/c;->a0(Lc4/c;Lc4/i1;)V

    iget-object p3, p3, Lc4/i1;->j:Landroid/os/Bundle;

    invoke-virtual {p0, p1, p2, p3}, Lc4/e1;->E2(ILandroid/os/IBinder;Landroid/os/Bundle;)V

    return-void
.end method

.method public final x1(ILandroid/os/Bundle;)V
    .locals 1

    new-instance p1, Ljava/lang/Exception;

    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    const-string p2, "GmsClient"

    const-string v0, "received deprecated onAccountValidationComplete callback, ignoring"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method
