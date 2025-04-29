.class public final synthetic Lj6/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lj6/p0;

.field public final synthetic b:Lj6/b1;


# direct methods
.method public synthetic constructor <init>(Lj6/p0;Lj6/b1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj6/c0;->a:Lj6/p0;

    iput-object p2, p0, Lj6/c0;->b:Lj6/b1;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lj6/c0;->a:Lj6/p0;

    iget-object v1, p0, Lj6/c0;->b:Lj6/b1;

    invoke-static {v0, v1}, Lj6/p0;->o(Lj6/p0;Lj6/b1;)Lj6/y1;

    move-result-object v0

    return-object v0
.end method
