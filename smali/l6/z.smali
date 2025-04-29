.class public final synthetic Ll6/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ll6/i0;


# direct methods
.method public synthetic constructor <init>(Ll6/i0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/z;->j:Ll6/i0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ll6/z;->j:Ll6/i0;

    invoke-static {v0}, Ll6/i0;->f(Ll6/i0;)V

    return-void
.end method
