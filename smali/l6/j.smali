.class public final synthetic Ll6/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ll6/k$a;


# direct methods
.method public synthetic constructor <init>(Ll6/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/j;->j:Ll6/k$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ll6/j;->j:Ll6/k$a;

    invoke-static {v0}, Ll6/k$a;->a(Ll6/k$a;)V

    return-void
.end method
