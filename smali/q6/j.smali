.class public final synthetic Lq6/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# instance fields
.field public final synthetic a:Lq6/g$c;


# direct methods
.method public synthetic constructor <init>(Lq6/g$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq6/j;->a:Lq6/g$c;

    return-void
.end method


# virtual methods
.method public final uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lq6/j;->a:Lq6/g$c;

    invoke-static {v0, p1, p2}, Lq6/g$c;->b(Lq6/g$c;Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void
.end method
