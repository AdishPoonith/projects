.class public final synthetic Lf1/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lf1/b0;

.field public final synthetic b:Ljava/util/concurrent/Callable;


# direct methods
.method public synthetic constructor <init>(Lf1/b0;Ljava/util/concurrent/Callable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/a0;->a:Lf1/b0;

    iput-object p2, p0, Lf1/a0;->b:Ljava/util/concurrent/Callable;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lf1/a0;->a:Lf1/b0;

    iget-object v1, p0, Lf1/a0;->b:Ljava/util/concurrent/Callable;

    invoke-static {v0, v1}, Lf1/b0;->a(Lf1/b0;Ljava/util/concurrent/Callable;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
