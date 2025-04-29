.class public final synthetic Lp3/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic j:Lp3/q;


# direct methods
.method public synthetic constructor <init>(Lp3/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp3/o;->j:Lp3/q;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 1

    iget-object v0, p0, Lp3/o;->j:Lp3/q;

    invoke-static {v0, p1}, Lp3/q;->b(Lp3/q;Landroid/os/Message;)Z

    move-result p1

    return p1
.end method
