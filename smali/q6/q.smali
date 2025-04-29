.class public final synthetic Lq6/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lq6/r;

.field public final synthetic k:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lq6/r;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq6/q;->j:Lq6/r;

    iput-object p2, p0, Lq6/q;->k:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lq6/q;->j:Lq6/r;

    iget-object v1, p0, Lq6/q;->k:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lq6/r;->a(Lq6/r;Ljava/lang/Runnable;)V

    return-void
.end method
