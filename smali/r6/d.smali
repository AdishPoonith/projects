.class public final synthetic Lr6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lr6/f;


# direct methods
.method public synthetic constructor <init>(Lr6/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr6/d;->a:Lr6/f;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr6/d;->a:Lr6/f;

    invoke-static {v0}, Lr6/f;->d(Lr6/f;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
