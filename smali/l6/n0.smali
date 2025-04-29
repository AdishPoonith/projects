.class public final synthetic Ll6/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ll6/o0$a;


# direct methods
.method public synthetic constructor <init>(Ll6/o0$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/n0;->j:Ll6/o0$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ll6/n0;->j:Ll6/o0$a;

    invoke-static {v0}, Ll6/o0$a;->a(Ll6/o0$a;)V

    return-void
.end method
