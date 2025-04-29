.class public final synthetic Ll6/t3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ll6/y3;


# direct methods
.method public synthetic constructor <init>(Ll6/y3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/t3;->j:Ll6/y3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ll6/t3;->j:Ll6/y3;

    invoke-static {v0}, Ll6/y3;->k(Ll6/y3;)V

    return-void
.end method
