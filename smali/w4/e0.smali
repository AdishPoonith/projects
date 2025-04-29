.class final Lw4/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw4/b0;


# instance fields
.field private final b:Lr4/n;

.field final synthetic c:Lw4/a0;


# direct methods
.method constructor <init>(Lw4/a0;)V
    .locals 0

    iput-object p1, p0, Lw4/e0;->c:Lw4/a0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lw4/a0;->K(Lw4/a0;)Lr4/n;

    move-result-object p1

    iput-object p1, p0, Lw4/e0;->b:Lr4/n;

    return-void
.end method


# virtual methods
.method public final a(III)Lw4/y;
    .locals 1

    :try_start_0
    iget-object v0, p0, Lw4/e0;->b:Lr4/n;

    invoke-interface {v0, p1, p2, p3}, Lr4/n;->C0(III)Lw4/y;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method
