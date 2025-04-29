.class public interface abstract Lw4/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lw4/y;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lw4/y;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v1, v2}, Lw4/y;-><init>(II[B)V

    sput-object v0, Lw4/b0;->a:Lw4/y;

    return-void
.end method


# virtual methods
.method public abstract a(III)Lw4/y;
.end method
