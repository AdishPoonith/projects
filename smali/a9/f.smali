.class public final synthetic La9/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La9/c$a;


# instance fields
.field public final synthetic a:Lr8/k$d;


# direct methods
.method public synthetic constructor <init>(Lr8/k$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La9/f;->a:Lr8/k$d;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/Future;)V
    .locals 1

    iget-object v0, p0, La9/f;->a:Lr8/k$d;

    invoke-static {v0, p1}, La9/l$a;->d(Lr8/k$d;Ljava/util/concurrent/Future;)V

    return-void
.end method
