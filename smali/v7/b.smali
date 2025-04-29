.class public final synthetic Lv7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lr8/k$d;


# direct methods
.method public synthetic constructor <init>(Lr8/k$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/b;->j:Lr8/k$d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lv7/b;->j:Lr8/k$d;

    invoke-interface {v0}, Lr8/k$d;->c()V

    return-void
.end method
