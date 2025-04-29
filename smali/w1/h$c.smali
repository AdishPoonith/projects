.class Lw1/h$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw1/g0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw1/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lw1/h;


# direct methods
.method private constructor <init>(Lw1/h;)V
    .locals 0

    iput-object p1, p0, Lw1/h$c;->a:Lw1/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lw1/h;Lw1/h$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lw1/h$c;-><init>(Lw1/h;)V

    return-void
.end method


# virtual methods
.method public a(Lw1/g0;[BII[B)V
    .locals 0

    iget-object p1, p0, Lw1/h$c;->a:Lw1/h;

    iget-object p1, p1, Lw1/h;->z:Lw1/h$d;

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw1/h$d;

    invoke-virtual {p1, p3, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method
